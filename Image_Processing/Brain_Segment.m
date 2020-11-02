clear all
clc

I = imread('high_res_brain.bmp');
imagesc(I);
colormap(gray);
axis image
axis off
I = im2bw(I,0.307);
[x,y,p] = impixel(I);

row = size(I,1);
col = size(I,2);
R = zeros(row,col);

flag = 1;
i=1;
se = strel('square',6);
while flag~=0
    R1 = imdilate(R,se);
    ind_R = find(R);
    mean_R = mean(I(ind_R));
    std_R = 2.0*std(double(I(ind_R)));
    if std_R<2
        std_R = 2;
    end
    ind_new = find(R1-R);
    Value_new = I(ind_new);
    R1(ind_new(find(abs(mean_R-Value_new)>std_R))) = 0;
    flag = nnz(R1-R);
    R = R1;
   % R = unit8(R);
    
    C = imfuse(R,I,'falsecolor');
    imshow(C);
    F(i) = getframe;
    i = i+1;
end
movie(F,1)
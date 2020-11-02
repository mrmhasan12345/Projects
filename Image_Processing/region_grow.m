function region_grow(pth,x,y,threshold)

if x~=0 & y~=0
    
Iorg = imread(pth);
%threshold = graythresh(I);
I = im2bw(Iorg,threshold);
row = size(I,1);
col = size(I,2);
R = zeros(row,col);
co_x = round(x(1));
co_y = round(y(1));

R(co_y,co_x) = 1;

flag = 1;

figure
colormap(gray)
axis image
axis off
se = strel('disk',5);
i = 1;

while flag ~= 0
R1 = imdilate(R,se);
R1 = R1 & I;
flag = nnz(R1-R);
R = R1;

%%%%%%%%%%%
    C = imfuse(R,Iorg,'falsecolor');
    imshow(C)

F(i) = getframe;
i = i+1;
%%%%%%%%%%%%%
end
end

x = 0;
y = 0;

end

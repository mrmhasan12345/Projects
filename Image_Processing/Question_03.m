clear all
clc

I = imread('NB1ln3.png');
th = graythresh(I);
%region_grow('NB1ln3.png',115,169,th);

I = im2bw(I,th);
row = size(I,1);
col = size(I,2);
R = zeros(row,col);
co_x = 115;
co_y = 169;

R(co_y,co_x) = 1;

flag = 1;

figure
colormap(gray)
axis image
axis off
se = strel('disk',5);

while flag ~= 0
R1 = imdilate(R,se);
R1 = R1 & I;
flag = nnz(R1-R);
R = I - R1;
end
imagesc(R1);

Rnew = I - R1;
imagesc(Rnew);
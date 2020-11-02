clear all;
clc;

I = imread('3.png');
imagesc(I);
axis image
axis off
[x,y] = getpts;

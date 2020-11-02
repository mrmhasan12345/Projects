clear all;
clc;
%{
I = imread('No_Of_Hidden_Neurons_Vs_Accuracy.png');
A = im2double(rgb2gray(imresize(I,[28 28])));
th=graythresh(A);
B = im2bw(A,th);
Input = B(:);

load my_net.mat
my_net(Input)
%imshow(A);
%}




clear all;
clc;

load my_net.mat;

% = tst(3,:);
img = imread('G:\PHY.SCI COL CAMP\Level-03\1st_sem\CS-3120_Machine_learning_&_Nural_Computing\CS_3120_Final_Project\Image_created\img_5.jpg');
if ndims(img)==3
    img = rgb2gray(img);
end
I = imresize(img,[28 28]);
I = I';
Input = I(:);
A = my_net(Input);
ind = find(A == max(A(:)));
if ind==10
    disp('0');
else
    disp(ind);
end
imshow(vec2mat(img,28));
%{
I = vec2mat(img,28);
I = imresize(I,[28 28]);
I = I';
Input = I(:);
figure
imshow(I)
Out = my_net(Input);
Input = Input';
%}


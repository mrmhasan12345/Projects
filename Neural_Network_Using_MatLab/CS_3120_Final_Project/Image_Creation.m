clear all;
clc;
load tst.mat;
for i=31:200
img = vec2mat(tst(i,:),28);
imwrite(img,strcat(strcat('img_',int2str(i)),'.jpg'));
end
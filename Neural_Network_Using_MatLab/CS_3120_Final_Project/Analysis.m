clear all;
clc;

tr = csvread('TRAIN_EDITED.csv',1,0);
%{
load my_net.mat
Initial_Weight_Matrix = getwb(my_net);
plotperform(tr);
figure
plottrainstate(tr);
%}

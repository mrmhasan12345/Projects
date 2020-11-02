clear all;
clc;

locat = location('high_res_brain.bmp');
x = locat(1);
y = locat(2);

close

region_grow('high_res_brain.bmp',x,y,0.307);
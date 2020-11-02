clear all
clc

locat = location('3.png');
x = locat(1);
y = locat(2);
th = locat(3);
close
region_grow('3.png',x,y,th);



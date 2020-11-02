clear all;
clc;
%{
locat = location('NB1ln3.png');
x = locat(1);
y = locat(2);
th = locat(3);
close


%region_grow('NB1ln3.png',115,169,th);
region_grow('NB1ln3.png',x,y,th);
%}


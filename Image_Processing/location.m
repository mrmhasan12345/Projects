function y = location(pth)
    I = imread(pth);
    th = graythresh(I);
    imagesc(I);
    axis image
    axis off
    
    [x,y] = getpts;
    y = [x,y,th];
end
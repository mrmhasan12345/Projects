clear all;
clc;

tr = csvread('TRAIN_EDITED.csv',1,0);
tst = csvread('test.csv',1,0);

%{
Ma = vec2mat(tr(10,1:783),28);
for n=1:100 
    subplot(10,10,n);
    imshow(vec2mat(tr(n,:),28));
end;
%}

tr(tr==0)=10;
Tr = dummyvar(tr(:,1));
Tr = Tr';
trn = tr(:,2:end);
trn = trn';

hiddenLayerSize = 250;
net = patternnet(hiddenLayerSize);

net.divideParam.trainRatio = 70/100;
net.divideParam.valRatio = 15/100;
net.divideParam.testRatio = 15/100;      
%net.trainParam.epochs=1000;         
net.trainParam.goal = 0;
net.trainParam.min_grad=0;

[net,tr] = train(net,trn,Tr);

%{
my_net = net;

save my_net;
%}
%to test the New data's
%{
net(tst(1,:)')
imshow(vec2mat(tst(1,:),28))
%}

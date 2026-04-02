aws ai practioner course:

section:1
video:7
S3:
object storage service. We can store any kind of files as they are stored in binary objects. physical storage is managed by the service automatically in background.
Can be used as data lake store by data engineer.
We have to create buckets in S3 to use this service. Bucket is used to store objects. Buckets are of 3 types: General Purpose, Directory, Outposts.  
= General storage → General Purpose Bucket
= Ultra-low latency & high throughput → Directory Bucket
= On‑prem AWS infrastructure → S3 on Outposts Bucket

video:8
To delete a bucket, we have to delete all objects in that bucket first.

section:2
#video:11
Artificial Intelligence:
capability in machines to be able to mimic human like behaviour. Here machines need to comprehend tasks on their own, make decisions. GenAi is usecase of AI.
Ex:ChatGpt, Dalle-E for images.

Machine Learning:
making systems perform tasks without need of giving specific instructions. We develope ml models with the help of data & algos.
Ex:detecting fraud transactions, stock predictions, etc.

Deep Learning:
type of ML. Here models have capability to recognize complex objects such as pictures, text, sound, etc.
Ex:in fields of computer vision-detecting objects, people & their emotions, natural language processing(chatbots)

neural network: digital network simulating biological neurons.

ml use cases for ecommerce(for these same use cases, we can use data warehouse, data visualisation tools as well):
prediction of when to conduct sale campaigns on site.
sales forecast
user churn-are users coming back to site after purchases


Building ML model steps:
1.Bussiness Use case
Why do we need to build ML model. What bussiness problem it will solve. Have we justified the value for building ML model.
2.Prepare data
Most important thing in ML is data. Identify sources of data & what sources we have to use. Clean data. Extract rich set of features from the data set and label the data if required.
3.Algorithm:
select/implement mathematical algorithms based on what we are trying to solve, predictions/classifications/etc?
4.Build Model:
using the ML algorithm & the feature based data set, we set on to build ML model.
5.Evaluation:
We need to evaluate ML Model based on test data:
does it predicting/classifying correctly?
If not we may have to start from earlier steps, can start from Prepare data step, may have to use large data set  
6.Deploying model:
After deploying model & it will be used by application/users
7.monitor model:
In prod is it giving right results?
Do we need to fine tune the model or train the model again
May be input values have changed, a new feature needs to added to the data set & train model again 

Roles:
Data Engineer-cleaning, preparing data
Data Scientist
ML Engineer

Data-the star of the show
The accuracy of the ML model depends on the data that we train on.
Phase-1:
first identify the data sources. Use tools to get data from those sources into a data store.
Phase-2:
We should make data usable. Does our data set contain missing column values or outlier values for certain rows, what should we do in these cases?
Do we have all columns of interest
Phase-3:
Generate a feature set.
feature=measurable property within dataset. Features should be selected on bussiness problem that is targeting to be solved.
label=is used to signify to ML model, that for a set of input values, this is the output value. In the end, ML will predict label values. This is used in supervised learning.
Ex: Lets say we have to build a model to predict house price based on given data as:
location | no. of rooms | broker | area | price
A       |       2       |   b1   | 1000 sq.ft | 10000
B       |       4       |   b1   | 1500 sq.ft | 20000
Now, from the data set, we need to extract features that can be fed into ML model. ML model which is mathematical in nature will look at patterns in feature set and the use those patterns to predict the future values. Feature set should make sense to ML model(here, we dont need broker in feature set as based on type of broker price of house won't change). 
feature set=[location, no. of rooms, area]
label=[price]
MLModel(featureSet, label)=>trained ML Model=>MLModel(featureSet)=>predicts labels
Feature Engineering=generating new features based on existing ones.
Labelled Data should have good spread of values, before using for training ML models. Ex: Lets say we are building ML Model to predict fraudulent transactions of a bank. Then training it with data having 90% of non-fraudulent data will bring bias to ML Model and after training it may predict fraudulent transactions as non-fraudulent as well. 

video:Different types of data
Semi-Structured Data:-
CSV(Comma Separated Values), JSON(Javascript Object Notation),
Structured Data:-
Db Tables
TimeSeries Data:-
data points over past time values. Mainly we do forecasting(predictions) with this type of data
Unstructured Data:-
images, audio, video, text, etc. We can use this data to classification of images.

video:Different Types of ML tasks:
Supervised Learning:
Training data will have input values & output values i.e, feature set & labels. After training ML model will predict labels. What we do is:-Regression(predicting future stock values), CLassifications(Binary(transaction is fraudulent or not), MultiClass(classification of images))
UnSupervised Learning:
Training data will have input values only i.e, feature set. This type is used for discovering patterns in the data and group the values
Reinforcement Learning:
ML model learns through trial and error, when it it gets right reward points are awarded, otherwise it changes the steps to get rewards.


video:Amazon SageMaker AI
Amazon SageMaker AI=fully managed ML service. Here, we can build, train, deploy ML models. It provides pre-built ML algorithms, compute, hosting the ML model(& giving API endpoint to give acces to apps & users), etc. 
Building feature based data set(collecting from multiple sources, cleaning it), training ML model(training data has to be loaded onto RAM), visualization can be done in local but for enterprise data we need powerful machines. Here we can use SageMaker 
Amazon SageMaker Canvas=tool to prepare data

video:Quick intro on different compute options:-
Amazon EC2=Amazon Elastic Cloud Compute=service provides on-demand scalable compute capacity on the cloud
Earlier:host their app in own servers. Work:procure hardware(servers, storage), setup datacenter, provide network cooling, etc
Now:We create & manage virtual servers on AWS Cloud.
When we create EC2 instances, they will be created within VPC(Virtual Private Cloud). Within aws, we choose region, within the region, VPC will be created. Amazon VPC is logically isolated virtual network. EC2 instances will be hosted within that VPC.
AWS Lambda=this is a form of serverless compute, here we don't even need to manage servers, amazon will do it for us. Just we have to host our code into it. Lamda service stops running after function execution is done. Lamda function can respond based on events. We pay only for the time we ran lamdas.
Container Based Applications:-
We can host containers on EC2 but specialized tools & services(Amazon ECR, Amazon ECS, Amazon EKS) are present in aws to manage & orchestrate container based workloads
Amazon ECR=Elastic Container Registry=fully managed registry service used to host your container based images
Amazon ECS=Elastic Container Service=fully managed container orchestration service
Amazon EKS=Elastic Kubernetes Service=fully managed kubernetes service on cloud. Here, it manages & orchestrates container based images on kuberenete software.
Amazon Machine Image =contains the operating system, application server, and applications for your instance. 

video:Lab-Connecting to the EC2 instance:
go to "security group"->"Edit inbound rules"->Add new rule with "Type as all traffic", "source as anywhere IPV4"->save rule->go to instance & select it->click connect with "public IP address"->logged into EC2 instance
to delete->select instance->click terminate option->delete security group created for this instance.

video:A note on the costing aspect:

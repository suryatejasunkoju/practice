video:
10. AWS Cloud Overview
current:5:24min
How to choose an AWS region:
Compliance:with data requirements & legal requirements, data never leaves a country without explicit permission
proximity to customers
Available services: all services won't be available in all countries
pricing:pricing will be region dependent

AWS availability regions:
Each region has multiple zones(min=3 & max=6)
Ex:
Availability region for Sydney=ap-southeast-2
zones in Sydney region are :ap-southeast-2a, ap-southeast-2b, ap-southeast-2c
Each availability zone is discrete data centers with redundant power, networking, connectivity & are isolated from disasters. All availability zones within a region are connected with low latency, high bandwidth networks
### AWS Points of Presence(Edge Locations):
Edge Locations primarily work with services like Amazon CloudFront, AWS's Content Delivery Network (CDN). When a user requests content, CloudFront retrieves it from the nearest Edge Location, minimizing travel time and improving performance. Frequently accessed content is cached at these locations, allowing users to retrieve it quickly without needing to access the origin server. This caching mechanism reduces server load and enhances load times.
With AWS Lambda@Edge, developers can execute code at Edge Locations in response to events, enabling real-time data processing and customization of content before it reaches the user. This is particularly useful for tasks like HTTP header manipulation, URL rewrites, and dynamic content personalization.

AWS Global services
IAM(Identity & Access Management)
Route 53(DNS Service)
WAF(Web Application Firewall)

AWS Regional services:
EC2(Infrastructure as a Service)
Elastic BeanStalk(Platform as a service)
Lamda(Function as a service)
Reckognition(Software as a service)

11. [Important] AWS Console UI Update

12. Tour of the Console & Services in AWS
Console:is the AWS Website itself

13. Shared Responsibility Model & AWS Acceptable Policy
https://aws.amazon.com/compliance/shared-responsibility-model/

14. IAM Introduction: Users, Groups, Policies
root account is only for account creation in aws. 
We should create users and assign them to all.
user groups:collection of users. A group cannot be present within another group.
users don't have to belong to a group & a user can belong to multiple groups simultaneously.
users/groups can be assigned policies(JSON docs). Policies==permisssions
use least privelage principle while assiging policies. Assign only required policies to users. 
IAM feature is global service, so we cant select a region in UI dropdown. Similary, users section belong to IAM. And users are created globally.
tags(key value pairs) can be set for every service in aws. Ex tag: department-opertions
sign-in url for users can be customized

15. IAM Users & Groups Hands On
create a group, assign a policy. create a user and assign this group to him/her.

16. AWS Console Simultaneous Sign-in
click "create multi-session" and the start session. So, that we can log in into multiple AWS accounts within same browser


17. IAM Policies
in-line policy=policy assigned to user directly & not to groups
user A belongs to group G1 & G2. Then A will get policies of G1 & G2 combined. Union of policies.
IAM policy structure:
{
    "Version":,
    "Id":,//an identifier for the policy-optional
    "Statement":[
        {
            "SId":1, //an identifier for the statement-optional
            "Effect":, //allows/denies for the policy access
            "Principal":{
                "AWS":["arn:aws:iam::123456:root"] //account/user/role for which policy is applied
            },
            "Action":[
                "S3:GetObject",
                "S3:PutObject"
            ],//list of actions this policy is allowed/denied to
            "Resource":"arn:aws:s3::mybucket/*" //list of resources this policy is applied to
            "Condition": //conditions when policy will be in effect-optional
        },
        {}
        ...
    ],
}

18. IAM Policies Hands On

19. IAM MFA Overview

20. IAM MFA Hands On

21. AWS Access Keys, CLI and SDK

22. AWS CLI Setup on Windows

23. AWS CLI Setup on Mac

24. AWS CLI Setup on Linux

25. AWS CLI Hands On

26. AWS CloudShell

27. IAM Roles for AWS Services

28. IAM Roles Hands On

29. IAM Security Tools

30. IAM Security Tools Hands On

31. IAM Best Practices

32. Shared Responsibility Model for IAM

33. IAM Summary


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

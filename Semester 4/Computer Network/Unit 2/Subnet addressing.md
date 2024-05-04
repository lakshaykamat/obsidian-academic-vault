# Subnet addressing
Subnet addressing is a technique used in computer networks to ==divide a large network (like a classful network) into smaller, more manageable logical networks called subnets==. Imagine a large apartment building with hundreds of residents. It would be chaotic to deliver mail to everyone at just one building address. Subnetting is like creating designated sections within the building (subnets) with their own addresses, making mail delivery (data routing) more efficient.

## Working  
### IP Addresses:
Every device on a network has a ==unique IP== (Internet Protocol) address, similar to a resident's apartment number in the building analogy. An IP address typically consists of four octets (sections) represented by numbers between 0 and 255 (e.g., 192.168.1.1).
### Subnet Mask:
A subnet mask is a 32-bit number (also represented in four octets) that works like a divider, ==separating the network portion of an IP address from the host portion==. The network part identifies the subnet, while the host part identifies the specific device within that subnet. Think of it as a combination of the building code (network address) and the apartment number (host address) within that building.
### Subnet ID:
The subnet ID is derived by applying the subnet mask to the original network address. It ==defines the specific subnet on the network==.
### Usable Hosts: 
Subnet addressing allows you to create multiple subnets from a single network, increasing the number of usable host addresses within that network. This is because the host portion of the IP address gets expanded with subnetting.

## Benefits of Subnet Addressing:
#### 1. Improved Network Management:
Dividing a large network into subnets makes it easier to manage and troubleshoot network issues. It's like having designated sections in the building (subnets) where you can focus attention if a mail delivery problem arises (network issue).
### 2. Security Enhancement:
Subnets can be used to isolate traffic and improve network security. By controlling access between subnets, you can limit the movement of unauthorized data within the network. Imagine having secure entry points for each section (subnet) of the apartment building.
### 3. Efficient Routing:
Subnets can optimize data routing within the network. Routers can more efficiently direct data packets to their intended destinations within the correct subnet.

## Drawbacks of Subnetting:
### 1. Increased Complexity:
Implementing and managing subnets adds some complexity to network administration compared to a single large network. It's like having to manage multiple sections within a building instead of one large space.
### 2. Addressing Waste:
Depending on the subnet mask chosen, there might be some unusable IP addresses within each subnet. This is similar to having some unused apartments due to inefficient layout choices in the building.
# Ring Topology
In a ring topology, each device is connected to exactly two other devices, forming a closed loop or ring. Data travels in one direction around the ring, passing through each device until it reaches its destination. Here are the key characteristics of ring topology:
![](https://media.geeksforgeeks.org/wp-content/uploads/20200526102238/Untitled-Diagram-153-1.png)

1. **Closed Loop:**
   - The network forms a closed loop or ring, where each device is connected to exactly two other devices.
   - The last device in the ring is connected to the first device, completing the loop.

2. **Point-to-Point Communication:**
   - Devices communicate directly with their neighboring devices in the ring.
   - Data travels in one direction, and each device acts as a repeater, regenerating and forwarding the data.

3. **Data Transmission:**
   - Data circulates around the ring until it reaches its destination.
   - Each device examines the destination address of the data and forwards it to the next device if it is not the intended recipient.

4. **Simple Structure:**
   - Ring topology has a simple and uniform structure, making it easy to implement and understand.

5. **Fault Tolerance:**
   - Ring topology has inherent fault tolerance. If one device or connection fails, the data can still reach its destination by traveling in the opposite direction around the ring.

6. **Performance:**
   - Ring topologies can provide a more stable and predictable performance compared to bus topologies, especially under heavy loads.

7. **Examples:**
   - Token Ring, a LAN protocol, is an example of a ring topology.
   - Some fiber-optic networks are implemented using a ring topology.

**Advantages:**
   - Simple and easy to install.
   - Inherent fault tolerance – if one device or connection fails, data can still circulate in the opposite direction.
   - Predictable performance under heavy loads.

**Disadvantages:**
   - Difficult to reconfigure or expand.
   - Adding or removing devices can disrupt the entire network.
   - Failure of the central cable or a single device can disrupt the entire network.

Ring topologies were more prevalent in the past, especially with the Token Ring LAN protocol. However, in modern networking, other topologies like star or mesh are often preferred due to their ease of management, scalability, and fault tolerance characteristics.
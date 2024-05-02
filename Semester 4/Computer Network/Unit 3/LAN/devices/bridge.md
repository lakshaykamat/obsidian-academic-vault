# Bridge
![](https://prepbytes-misc-images.s3.ap-south-1.amazonaws.com/assets/1678697085974-Group%2011.png)
A bridge acts like a translator and gatekeeper between two separate network segments. Imagine it like a bridge connecting two islands, allowing traffic (data) to flow between them but controlling what gets through. Here's a breakdown of how bridges work:

- **Connecting Segments:** Bridges connect two or more LAN (Local Area Network) segments, extending the overall network reach.
- **Learning and Filtering:** Bridges learn the MAC addresses (unique identifiers) of devices on each connected segment. They then filter the data packets based on their destination addresses.
- **Forwarding Traffic:** A bridge only forwards data packets that are intended for devices on the other segment. Packets meant for devices on the same segment where the bridge is located are not forwarded, reducing unnecessary traffic. This filtering helps to improve network performance and efficiency.
- **Collision Reduction:** By limiting traffic between segments, bridges can also help to reduce collisions that can occur when multiple devices try to transmit data simultaneously.

**Benefits of Bridges:**

- **Extends Network Reach:** Bridges allow you to connect separate network segments, expanding the overall network coverage.
- **Improves Performance:** By filtering traffic and reducing collisions, bridges contribute to a smoother and faster network experience.
- **Segmentation Benefits:** Bridges can help to isolate network problems within a specific segment, preventing them from impacting the entire network.

**Common Uses of Bridges:**

- **Connecting Buildings:** In a company with multiple buildings, bridges can connect the separate LANs in each building into a single, larger network.
- **Segmenting Large Networks:** Large networks can be divided into smaller segments using bridges to improve overall network performance and manageability.

**Differences from Switches and Routers:**

- **Switches:** Operate at Layer 2 (Data Link Layer) of the OSI model, focusing on MAC addresses for directing traffic within a network. Bridges also operate at Layer 2.
- **Routers:** Operate at Layer 3 (Network Layer) of the OSI model, using IP addresses to route traffic between different networks.

**In simple terms:** Switches manage traffic within a single network, like a smart traffic controller within your neighborhood. Bridges connect separate neighborhoods (network segments) and control the flow of traffic between them. Routers, on the other hand, are like the highway exits that connect your neighborhood to the wider internet.
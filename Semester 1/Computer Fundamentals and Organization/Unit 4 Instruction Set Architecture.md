# Unit 4 Instruction Set Architecture

# Instruction set based classification of processors

Instruction set based classification of processors refers to the categorization of processors based on the instruction set architecture (ISA) they use. An instruction set is a set of basic instructions that a processor can execute. The ISA defines the basic commands that the processor can understand, as well as the data types and registers it can manipulate.

There are several instruction set architectures that processors can be based on, but the most common ones are:

## CISC

CISC stands for Complex Instruction Set Computing. It is an instruction set architecture (ISA) for processors that have a large instruction set, which means they can execute a wide variety of instructions. CISC processors typically have a larger number of registers and more complex addressing modes than RISC processors.

Some of the characteristics of CISC processors are:

- More complex instruction encoding: CISC instruction set encodings are more complex than RISC instruction set, which means that CISC instructions are typically longer and more difficult to decode.
- Variable-length instruction format: CISC instructions have variable-length instruction format, making them more complex to decode and execute
- More instructions: CISC processors have a large instruction set, which means they can execute a wide variety of instructions, allowing for more powerful and complex operations
- More addressing modes: CISC processors typically have more addressing modes, which allows them to access memory in more complex ways
- More registers: CISC processors typically have more registers, which allows them to store more data on the processor itself

CISC processors are designed to make the programming easier for programmers, as the instruction set is more complex, more capable, and more expressive. Examples of CISC processors include the x86 and the Motorola 68000.

CISC processors were popular in the past, but with the advancements in technology, RISC processors are more popular now, as they are more efficient and faster.

## RISC

RISC stands for Reduced Instruction Set Computing. It is an instruction set architecture (ISA) for processors that have a smaller instruction set, which means they can execute fewer instructions than CISC processors. RISC processors typically have a smaller number of registers and simpler addressing modes than CISC processors.

Some of the characteristics of RISC processors are:

- Simple instruction encoding: RISC instruction set encodings are simpler than CISC instruction set, which means that RISC instructions are typically shorter and easier to decode.
- Fixed-length instruction format: RISC instructions have a fixed-length instruction format, making them easier to decode and execute
- Fewer instructions: RISC processors have a smaller instruction set, which means they can execute fewer instructions than CISC processors.
- Fewer addressing modes: RISC processors typically have fewer addressing modes, which makes them simpler and more efficient
- Fewer registers: RISC processors typically have fewer registers, which means they need to access memory more frequently

RISC processors are designed to be more efficient and faster than CISC processors, as the instruction set is simpler, more regular, and more uniform. Examples of RISC processors include the ARM and the PowerPC.

RISC processors are more popular now, as they are more efficient and faster than CISC processors, and are widely used in embedded systems and mobile devices, as well as in servers, workstations and supercomputers.

# Addressing Modes

Addressing modes are the ways in which a processor can access memory to fetch operands for instructions. They determine how the memory address of an operand is calculated and specified in an instruction. Different processors have different addressing modes, and the choice of addressing mode can have a significant impact on the performance of the processor.

Some common types of addressing modes include:

- **Immediate:** The operand is specified as an immediate value in the instruction. This addressing mode is used when the value of the operand is known at assembly or compile time.
- Register: The operand is stored in a register within the processor. This addressing mode is fast, as the operand can be accessed directly by the processor without needing to access memory.
- Direct: The memory address of the operand is specified in the instruction. This addressing mode is used when the memory address of the operand is known at assembly or compile time.
- Indirect: The memory address of the operand is stored in a register or memory location, and the instruction specifies the register or memory location that holds the address. This addressing mode is used when the memory address of the operand is not known at assembly or compile time.
- indexed: The instruction specifies a base memory address and an offset, which are added together to form the memory address of the operand. This addressing mode is used when the operand is part of an array or table.

These are some examples of addressing modes, different processors may have different addressing modes available or different variations of the above mentioned addressing modes, depending on the ISA.

# Operations in the instruction set

The instruction set of a processor defines the operations that the processor can perform. These operations include basic arithmetic and logical operations, as well as data movement and control flow instructions.

Some common operations in the instruction set include:

- **Arithmetic operations:** These include basic operations such as addition, subtraction, multiplication, and division. Some processors also include more advanced arithmetic operations such as square root and trigonometric functions.
- **Logical operations:** These include operations such as AND, OR, NOT, and XOR. These operations are used to perform bitwise operations on data.
- **Data movement operations:** These include instructions that move data between registers, between memory and registers, and between different memory locations.
- **Control flow operations:** These include instructions that change the flow of execution in the program. Examples include branches, jumps, and subroutine calls.
- **Bit manipulation operations:** These include operations that manipulate individual bits within a word of data. Examples include shift, rotate, set, and test operations.
- **Memory operations:** These include operations that access memory, such as load and store operations.
- Input/Output operations: These include operations that transfer data between the processor and external devices such as I/O ports, keyboard, mouse, etc.
- Exception handling operations: These include operations that handle exceptional conditions such as divide by zero, overflow, and memory protection violations.

The specific set of operations available in a processor's instruction set will depend on the instruction set architecture (ISA) of the processor. Different ISAs provide different levels of functionality and performance.

# What is Networking

Networking is the practice of connecting multiple devices, such as computers, servers, mobile devices, and other electronic devices, together to share resources and exchange information. This allows the devices to communicate and collaborate with each other to achieve a common goal or perform a specific task.

There are several types of networks, including:

- Local area networks (LANs): These networks connect devices in a small geographic area, such as a single building or campus.
- Wide area networks (WANs): These networks connect devices over a larger geographic area, such as a city or country.
- Metropolitan area networks (MANs): These networks connect devices within a metropolitan area, such as a city.

Networks can be wired or wireless, and they can be based on different technologies and protocols. Some common network technologies include Ethernet, TCP/IP, and Wi-Fi.

Networking enables the sharing of resources such as printers, storage devices, and software applications, and allows devices to communicate with each other and with the internet. Networking also enables the sharing of files and data, and allows users to collaborate and share information in real-time.

Networks are used in a variety of settings, including homes, businesses, government agencies, and educational institutions. They play a critical role in enabling communication, collaboration, and the sharing of information and resources.
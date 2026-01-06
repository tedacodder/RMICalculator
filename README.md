#🚀 Java RMI Calculator (Terminal-Based) — Java 17 Compatible

A terminal-based distributed calculator using Java RMI, running client and server in separate JVMs.
All calculation logic executes on the server, while the client interacts via remote method calls.

##📌 Project Overview

This project demonstrates:

Distributed Programming in Java

Remote Method Invocation (RMI) architecture

Remote Interfaces (Calculator.java)

Stub-based invocation, serialization, and marshalling

Exception handling (RemoteException, NotBoundException)

Java 17 compatibility (no deprecated SecurityManager)

“RMI allows remote calls to appear local — the server executes logic while the client only calls methods.”



⚙ Requirements

Java JDK 17 or later

Windows OS (CMD terminal)

No external libraries

Check your Java version:

java --version
javac --version


⚠️ Must be JDK, not JRE.

🧮 Supported Operations

All executed on the server:

Operation	Description
Addition	a + b
Subtraction	a - b
Multiplication	a * b
Division	a / b
Modulus	a % b
Power	Math.pow(a, b)
Square Root	Math.sqrt(a)
🛠 Compilation Instructions (Windows CMD)
1️⃣ Navigate to project root:
cd "C:\Users\new\IdeaProjects\RMI_Calculator"


(Adjust path if needed)

2️⃣ Compile all Java files:
javac common\*.java server\*.java client\*.java


✅ .class files are generated in respective folders.

▶ Running the Application
1️⃣ Start the RMI Registry

If rmiregistry is not recognized:

java -cp . sun.rmi.registry.RegistryImpl 1099


Leave this terminal open.

2️⃣ Start the Server

Open a new terminal:

cd "C:\Users\new\IdeaProjects\RMI_Calculator"
java server.RMIServer


Expected output:

RMI Calculator Server is running...

3️⃣ Start the Client

Open another terminal:

cd "C:\Users\new\IdeaProjects\RMI_Calculator"
java client.RMIClient


You will see the interactive menu:

1. Add  2. Subtract  3. Multiply  4. Divide
5. Modulus  6. Power  7. Square Root  0. Exit
Enter choice:


Enter numbers as prompted. Results are calculated on the server.

##❗ Important Notes

Start terminals in order: Registry → Server → Client

Do not close the registry while the server or client is running

Binding name in server:

Naming.rebind("rmi://localhost:1099/CalculatorService", calculator);


Client must use exact same name:

Calculator calc = (Calculator) Naming.lookup("rmi://localhost:1099/CalculatorService");


SecurityManager is not needed in Java 17

##🐞 Common Errors & Fixes
Error	Cause	Fix
'rmiregistry' is not recognized	JDK bin not in PATH	Use java -cp . sun.rmi.registry.RegistryImpl 1099
ConnectException: Connection refused	Registry/server not running	Start registry → server → client
NotBoundException	Wrong binding name	Ensure "CalculatorService" is identical in server and client
🚀 Possible Enhancements

Multi-client support (RMI handles threads automatically)

Logging remote method calls: System.out.println("Method called")

RMI callbacks

RMI + Database integration

Java Module System support (module-info.java)

Compare RMI vs REST/gRPC for distributed systems


## 🗂 Project Structure
```bat
RMI_Calculator/
│
├── common/
│   └── Calculator.java          # Remote Interface
│
├── server/
│   ├── CalculatorImpl.java      # Remote Object Implementation
│   └── RMIServer.java           # Server Entry Point
│
├── client/
│   └── RMIClient.java           # Terminal-Based Client
│
├── policy/
│   └── java.policy              # (Optional)
│
└── README.md                    # This file
```



---

## ⚙ Requirements

- **Java JDK 17 or later**  
- **Windows OS (CMD terminal)**  
- **No external libraries**

Check your Java version:

```bat
java --version
javac --version
```

## 🛠 Compilation & Running Instructions (Windows CMD)

Follow these steps **in order** to compile and run the Java RMI Calculator:

---

### 1️⃣ Navigate to Project Root

Open CMD and type:

```bat
cd "C:\Users\new\IdeaProjects\RMI_Calculator"
```
2️⃣ Compile All Java Files
```bat
javac common\*.java server\*.java client\*.java
```


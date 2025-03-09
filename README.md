<!DOCTYPE html>
<html>
<head>
    <title>README - Singly Linked List</title>
</head>
<body>
    <h1>Singly-Linked-List-Java</h1>
    <p>A Java implementation of a Singly Linked List supporting insertion and deletion at both the beginning and the end.</p>
    
   <h2>📌 Features</h2>
    <ul>
        <li>Implements a Singly Linked List.</li>
        <li>Supports operations: <code>addAtBeginning()</code>, <code>addAtEnd()</code>, <code>removeFromBeginning()</code>, and <code>removeFromEnd()</code>.</li>
        <li>Efficient <strong>O(1)</strong> time complexity for head insertions/deletions.</li>
    </ul>
    
   <h2>📂 Project Structure</h2>
    <pre>
    Singly-Linked-List-Java/
    ├── src/
    │   ├── Node.java
    │   ├── LinkedList.java
    │   ├── Main.java
    ├── README.html
    └── .gitignore
    </pre>
    
  <h2>⚡ Usage</h2>
    <p>Clone the repository and run the Java program:</p>
    <pre>
    git clone https://github.com/Singly-Linked-List-Java.git
    cd Singly-Linked-List-Java/src
    javac Main.java
    java Main
    </pre>
    
   <h2>📜 Code Example</h2>
    <pre>
    LinkedList list = new LinkedList();
    list.addAtBeginning(10);
    list.addAtEnd(20);
    list.removeFromBeginning();
    list.removeFromEnd();
    </pre>
    
  <h2>📄 License</h2>
    <p>MIT License</p>
</body>
</html>

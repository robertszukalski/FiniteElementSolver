Implementing the main solver logic for a Finite Element Method (FEM) application with triangular mesh in Java involves several steps. Let's break down the implementation into more manageable parts. I'll provide a basic structure, focusing on the key components without delving into the full mathematical complexity, which can be quite extensive.

### Step 1: Define Basic Classes

#### Node Class

```java
public class Node {
    private double x, y; // Coordinates
    private double displacement; // Displacement of the node

    public Node(double x, double y) {
        this.x = x;
        this.y = y;
        this.displacement = 0;
    }

    // Getters and setters for x, y, and displacement
}
```

#### TriangleElement Class

```java
public class TriangleElement {
    private Node[] nodes; // The three nodes of the triangle

    public TriangleElement(Node node1, Node node2, Node node3) {
        this.nodes = new Node[]{node1, node2, node3};
    }

    public double[][] calculateStiffnessMatrix() {
        // Implement the stiffness matrix calculation
        // Placeholder for actual implementation
        return new double[3][3];
    }

    // Getters for nodes
}
```

#### BeamMesh Class

```java
import java.util.ArrayList;
import java.util.List;

public class BeamMesh {
    private List<Node> nodes;
    private List<TriangleElement> elements;

    public BeamMesh() {
        this.nodes = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addElement(TriangleElement element) {
        elements.add(element);
    }

    public double[][] assembleGlobalStiffnessMatrix() {
        // Assemble the global stiffness matrix from all elements
        // Placeholder for actual implementation
        return new double[nodes.size()][nodes.size()];
    }

    // Methods to apply forces and set boundary conditions
}
```

### Step 2: Main Solver Logic

#### FiniteElementSolver Class

```java
public class FiniteElementSolver {

    public static void main(String[] args) {
        BeamMesh mesh = createBeamMesh();

        // Apply force and boundary conditions
        applyForce(mesh);
        applyBoundaryConditions(mesh);

        // Solve for displacements
        solve(mesh);

        // Output results
        outputResults(mesh);
    }

    private static BeamMesh createBeamMesh() {
        // Create and return the beam mesh with nodes and elements
        // Placeholder for actual mesh generation
        BeamMesh mesh = new BeamMesh();
        // Add nodes and elements to the mesh
        return mesh;
    }

    private static void applyForce(BeamMesh mesh) {
        // Apply forces to the appropriate nodes in the mesh
    }

    private static void applyBoundaryConditions(BeamMesh mesh) {
        // Set boundary conditions for the mesh
    }

    private static void solve(BeamMesh mesh) {
        // Solve the system of equations for displacements
    }

    private static void outputResults(BeamMesh mesh) {
        // Output the results (displacements of nodes, etc.)
    }
}
```

### Notes:

- The actual implementation of the stiffness matrix calculation and the global stiffness matrix assembly is complex and requires a deep understanding of FEM principles.
- The methods for applying forces, boundary conditions, and solving the system are placeholders and need detailed implementation based on the specific FEM theory you choose to follow.
- The `outputResults` method would typically include printing the displacements or visualizing the deformed beam, depending on your requirements.

This structure provides a skeleton to get you started with your FEM solver. Each part of the code, especially the mathematical computations, will need in-depth implementation.
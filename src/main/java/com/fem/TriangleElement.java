package com.fem;

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

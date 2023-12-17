package com.fem;

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

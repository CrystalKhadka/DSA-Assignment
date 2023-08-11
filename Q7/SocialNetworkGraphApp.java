package Q7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
    private String name;
    private ImageIcon profilePicture;
    private int followers;
    // Add other user-related information and methods as needed

    public User(String name, ImageIcon profilePicture, int followers) {
        this.name = name;
        this.profilePicture = profilePicture;
        this.followers = followers;
    }

    // Getters and Setters for user-related information
}

class Edge {
    private int strength;
    // Add other edge-related information and methods as needed

    public Edge(int strength) {
        this.strength = strength;
    }

    // Getters and Setters for edge-related information
}

class GraphPanel extends JPanel {
    private List<User> users;
    private List<Edge> edges;

    public GraphPanel(List<User> users, List<Edge> edges) {
        this.users = users;
        this.edges = edges;

        // Implement drawing of nodes and edges on the canvas here
        // Use mouse listeners for node selection and deletion
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Implement drawing of nodes and edges on the canvas here
    }

    // Implement other methods for drawing nodes and edges, node selection, and deletion
}

public class SocialNetworkGraphApp extends JFrame {
    private GraphPanel graphPanel;
    private List<User> users;
    private List<Edge> edges;

    public SocialNetworkGraphApp() {
        users = new ArrayList<>();
        edges = new ArrayList<>();

        // Read user data from a file and populate the users and edges lists accordingly

        graphPanel = new GraphPanel(users, edges);
        add(graphPanel);

        // Implement the toolbar with buttons for selecting mode, adding nodes, and adding edges

        // Implement search functionality and highlighting of nodes and connections

        setupMainFrame();
    }

    private void setupMainFrame() {
        setTitle("Social Network Graph");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SocialNetworkGraphApp();
            }
        });
    }
}


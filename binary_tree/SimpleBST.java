import java.util.Scanner;

public class SimpleBST {
    private Node root;

    private class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    // Insert function
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertRec(node.left, value);
        } else if (value > node.value) {
            node.right = insertRec(node.right, value);
        }

        return node;
    }

    // Find function
    public boolean find(int value) {
        return findRec(root, value);
    }

    private boolean findRec(Node node, int value) {
        if (node == null) {
            return false;
        }

        if (value == node.value) {
            return true;
        } else if (value < node.value) {
            return findRec(node.left, value);
        } else {
            return findRec(node.right, value);
        }
    }

    // Delete function
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node node, int value) {
        if (node == null) return null;

        if (value < node.value) {
            node.left = deleteRec(node.left, value);
        } else if (value > node.value) {
            node.right = deleteRec(node.right, value);
        } else {
            // Node with only one child or no child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            node.value = minValue(node.right);

            // Delete the inorder successor
            node.right = deleteRec(node.right, node.value);
        }

        return node;
    }

    private int minValue(Node node) {
        int minv = node.value;
        while (node.left != null) {
            minv = node.left.value;
            node = node.left;
        }
        return minv;
    }
    //search
    boolean search(int key){
        return searchRec(root, key);
    }
    boolean searchRec(Node root, int key){
        if (root == null) return false;
        if (root.value == key) return true;

        if (root.value < key) return searchRec(root.right, key);

        return searchRec(root.left, key);
    }
    // Print the tree in order
    public void printInOrder() {
        printInOrderRec(root);
        System.out.println();
    }

    private void printInOrderRec(Node node) {
        if (node != null) {
            printInOrderRec(node.left);
            System.out.print(node.value + " ");
            printInOrderRec(node.right);
        }
    }

    public static void main(String[] args) {
        SimpleBST tree = new SimpleBST();

        Scanner scanner = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("\n  Binary Search Tree Operations Here You Can choice :");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display Inorder");
            System.out.println("5. Exit");
            System.out.print("Now Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    while (true){
                        System.out.print("Enter value to insert (After insert type -1 to end ): ");
                        value = scanner.nextInt();
                        if (value == -1) {
                            break;
                        }
                        tree.insert(value);
                    }
                    break;
                case 2:
                    System.out.print("Enter value to search : ");
                    value = scanner.nextInt();
                    boolean found = tree.search(value);
                    if (found){
                        System.out.println("Value " + value + " is found in the tree.");
                    } else{
                        System.out.println("Value " + value + " is not found in the tree.");
                    }
                    break;
                case 3:
                    System.out.print("Enter value to delete : ");
                    value = scanner.nextInt();
                    tree.delete(value);
                    System.out.println("Value " + value + " is successfully  deleted from the tree.");
                    break;
                case 4:
                    System.out.println("Inorder traversal of the BST:");
                    tree.printInOrder();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting successfully!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! try again !.");
            }
        }
    }


}
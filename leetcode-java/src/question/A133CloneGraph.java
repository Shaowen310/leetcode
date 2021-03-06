package question;

/**
 * <p>
 * Clone an undirected graph. Each node in the graph contains a label and a list
 * of its neighbors.
 * </p>
 *
 * <p>
 * OJ's undirected graph serialization:
 * </p>
 *
 * <p>
 * Nodes are labeled uniquely. We use # as a separator for each node, and , as a
 * separator for node label and each neighbor of the node.
 * </p>
 *
 * <p>
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 * </p>
 *
 * <p>
 * The graph has a total of three nodes, and therefore contains three parts as
 * separated by #.
 * </p>
 *
 * <ul>
 * <li>First node is labeled as 0. Connect node 0 to both nodes 1 and 2.</li>
 * <li>Second node is labeled as 1. Connect node 1 to node 2.</li>
 * <li>Third node is labeled as 2. Connect node 2 to node 2 (itself), thus
 * forming a self-cycle.</li>
 * </ul>
 *
 * <p>
 * Visually, the graph looks like the following:
 * </p>
 * 
 * <p>
 * 
 * <pre>
 *     1
 *    / \
 *   /   \
 *  0 --- 2
 *       / \
 *       \_/
 * </pre>
 * </p>
 */
public interface A133CloneGraph {

}

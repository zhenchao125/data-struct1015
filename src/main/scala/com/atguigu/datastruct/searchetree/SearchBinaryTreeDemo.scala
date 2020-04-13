package com.atguigu.datastruct.searchetree

/**
 * Author atguigu
 * Date 2020/4/13 12:48
 */
object SearchBinaryTreeDemo {
    def initTree() = {
        val arr = Array(8, 4, 9, 10, 1, 6, 7, 12)
        val tree = new SearchBinaryTree[Int]()
        
        arr.foreach(x => tree.add(x))
        
        tree
    }
    
    def main(args: Array[String]): Unit = {
        val tree = initTree()
        //        tree.infixForeach(println)
        println(tree.search(8))
        println(tree.search(10))
        println(tree.search(7))
    }
    
    
}

/**
 * 排序二叉树
 *
 * @tparam T
 */
class SearchBinaryTree[T: Ordering] {
    // 冥界召唤Ordering[T]的隐式值
    private val ord: Ordering[T] = implicitly[Ordering[T]]
    
    var root: TreeNode[T] = _
    
    def search(v: T): TreeNode[T] = {
        // 空树, 直接返回null
        if (root == null) null
        else root.search(v)
    }
    
    /**
     * 给树添加节点
     *
     * @param v
     */
    def add(v: T) = {
        if (root == null) { // 如果第一次添加,自动成为根节点
            root = new TreeNode[T](v)
        } else root.add(v) // 如果要添加的节点不是root, 交给root节点去完成
    }
    
    def infixForeach(op: T => Unit): Unit = {
        if (root != null) {
            if (root.left != null) root.left.infixForeach(op)
            op(root.value)
            if (root.left != null) root.right.infixForeach(op)
        }
    }
}

/**
 * 表示二叉排序树中的一个节点
 *
 * @param value
 * @tparam T
 */
class TreeNode[T: Ordering](var value: T) {
    
    
    // 冥界召唤Ordering[T]的隐式值
    private val ord: Ordering[T] = implicitly[Ordering[T]]
    
    // 左节点
    var left: TreeNode[T] = _
    // 右节点
    var right: TreeNode[T] = _
    // 父节点
    var p: TreeNode[T] = _
    
    def search(v: T): TreeNode[T] = {
        println(v)
        // 1. 先判断当前节点是否是要找的节点
        // 2. 如果不是, 判断是否小于当前节点的, 如果是, 则去left找
        // 3. 否则去右边找
        if (ord.equiv(v, value))
            this
        else if (ord.lt(v, value) && left != null)
            left.search(v)
        else if (ord.gt(v, value) && right != null)
            right.search(v)
        else
            null
    }
    
    def add(v: T): Boolean = {
        if (ord.lteq(v, value)) { // 要么添加到左子树: 要添加的值小于等于当前root节点的值
            if (left == null) { // //如果左节点是null, 则新添加的值直接成为左节点
                left = new TreeNode(v)
                left.p = this // 左节点的父节点是当前节点
            }
            else left.add(v) // 否则交个左节点继续处理
        } else { // 要么添加到右子树: 要添加的值大于当前root节点的值
            if (right == null) {
                right = new TreeNode(v)
                right.p = this
            }
            else right.add(v)
        }
        true
        
    }
    
    /**
     * 中序遍历
     * 排序二叉树来说, 只要中序遍历才有意义
     *
     * @param op
     */
    def infixForeach(op: T => Unit): Unit = {
        if (left != null) left.infixForeach(op)
        op(value)
        if (right != null) right.infixForeach(op)
    }
    
    override def toString: String = s"value = $value"
}


/*
为了方便处理root节点, 这次把树和节点分开

 */
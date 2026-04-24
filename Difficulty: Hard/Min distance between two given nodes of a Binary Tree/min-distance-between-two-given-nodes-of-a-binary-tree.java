class GfG {

    int findDist(Node r, int a, int b) {
        Node l = lca(r, a, b);
        return dist(l, a) + dist(l, b);
    }

    Node lca(Node r, int a, int b) {
        if (r == null) return null;

        if (r.data == a || r.data == b) return r;

        Node l = lca(r.left, a, b);
        Node rt = lca(r.right, a, b);

        if (l != null && rt != null) return r;

        return (l != null) ? l : rt;
    }

    int dist(Node r, int x) {
        if (r == null) return -1;

        if (r.data == x) return 0;

        int l = dist(r.left, x);
        if (l != -1) return l + 1;

        int rt = dist(r.right, x);
        if (rt != -1) return rt + 1;

        return -1;
    }
}
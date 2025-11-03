public interface CartVisitor {
    void visit(Book book);

    void visit(Electronics electronics);
}

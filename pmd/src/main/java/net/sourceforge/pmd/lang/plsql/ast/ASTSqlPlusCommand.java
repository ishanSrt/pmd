/* Generated By:JJTree: Do not edit this line. ASTSqlPlusCommand.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTSqlPlusCommand extends SimpleNode {
  public ASTSqlPlusCommand(int id) {
    super(id);
  }

  public ASTSqlPlusCommand(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=31f7c8a4dead9379c1cc5ee0dcc9ea29 (do not edit this line) */

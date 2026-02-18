package edu.ntnu.idatx2003.replace;

import edu.ntnu.idatx2003.TextCommand;

public class ReplaceTextCommand implements TextCommand {

  protected final String target;
  protected final String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  @Override
  public String execute(String text) {
    return text.replace(target, replacement);
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }
}
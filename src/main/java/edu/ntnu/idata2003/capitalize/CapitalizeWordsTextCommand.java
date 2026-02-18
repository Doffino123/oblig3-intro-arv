package edu.ntnu.idata2003.capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
  @Override
  public String execute(String text) {
    final String space = " ";
    StringBuilder result = new StringBuilder();

    boolean first = true;
    for (String word : text.split(space)) {
      if (!first) {
        result.append(space);
      }
      result.append(super.execute(word));
      first = false;
    }
    return result.toString();
  }
}

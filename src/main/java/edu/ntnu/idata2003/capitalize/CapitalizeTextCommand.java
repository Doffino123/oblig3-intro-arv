package edu.ntnu.idata2003.capitalize;

import edu.ntnu.idata2003.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  @Override
  public String execute(String text) {
    if (!text.isBlank()) {
      text = text.substring(0, 1).toUpperCase() + text.substring(1);
    }
    return text;
  }

}

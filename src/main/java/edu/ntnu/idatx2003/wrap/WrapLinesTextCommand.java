package edu.ntnu.idatx2003.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {

  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    String[] lines = text.split(System.lineSeparator());
    StringBuilder buffer = new StringBuilder();

    boolean first = true;
    for (String line : lines) {
      if (!first) {
        buffer.append(System.lineSeparator());
      }
      buffer.append(super.execute(line));
      first = false;
    }

    return buffer.toString();
  }
}
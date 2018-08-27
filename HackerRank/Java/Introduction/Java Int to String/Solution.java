// One liner solution which is probably the clearest and most efficient.
String s = String.valueOf(n);

// Additional ways
String s = Integer.toString(n); // also isValid
String s = "" + n; // slower
String s = new String(n); // never do this as it creates a new object reference rather than using the String object pool
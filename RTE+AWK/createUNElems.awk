#!/bin/awk -f
BEGIN {
	FS=";"
	printf("Huu\n")
}
{
	FILENAME="UN_E" $1 ".java"
	printf("package UN_EDIFACT.V4;\n\n") > FILENAME
	printf("import UN_EDIFACT.Element;\n\n") >> FILENAME
	printf("/**\n") >> FILENAME
	printf(" * UN-EDIFACT SYNTAX VERSION 4\n") >> FILENAME
	printf(" * %s  %s  %s\n", $1, $2, $3) >> FILENAME
	printf(" * %s\n", $4) >> FILENAME
	printf(" */\n") >> FILENAME
	printf("public class UN_E%s extends Element {\n\n", $1) >> FILENAME
	printf("    public UN_E%s() {\n", $1) >> FILENAME
	printf("        this(null);\n") >> FILENAME
	printf("    }\n\n") >> FILENAME
	printf("    public UN_E%s(String Content) {\n", $1) >> FILENAME
	printf("        super(\"%s\", \"%s\", \"%s\", \"%s\");\n", $1, $2, $3, $4) >> FILENAME
	printf("        this.setContent(Content);\n") >> FILENAME
	printf("    }\n}\n\n") >> FILENAME
	close(FILENAME)
}
END {
	printf("Haa\n")
}

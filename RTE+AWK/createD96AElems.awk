#!/bin/awk -f
# Skriptillä luodaan CSV-tiedostosta EDIFACT-elementtien java-luokat
# CSV-tiedoston kentät:
# tag; description; format; long description; note
# esim: 
# 9419;Service layer, coded;an..3;Subdivision of a service by code.;User or association defined code.  May be used in combination with 1131/3055.
BEGIN {
	FS=";"
	printf("Huu\n")
}
{
	FILENAME="E" $1 ".java"
	printf("package UN_EDIFACT.D96A;\n\n") > FILENAME
	printf("import UN_EDIFACT.Element;\n\n") >> FILENAME
	printf("/**\n") >> FILENAME
	printf(" * UN-EDIFACT D.96A\n") >> FILENAME
	printf(" * %s  %s  %s\n", $1, $2, $3) >> FILENAME
	printf(" * %s\n", $4) >> FILENAME
	printf(" */\n") >> FILENAME
	printf("public class E%s extends Element {\n\n", $1) >> FILENAME
	printf("    public E%s() {\n", $1) >> FILENAME
	printf("        this(null);\n") >> FILENAME
	printf("    }\n\n") >> FILENAME
	printf("    public E%s(String Content) {\n", $1) >> FILENAME
	printf("        super(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\");\n", $1, $2, $3, $4, $5) >> FILENAME
	printf("        this.setContent(Content);\n") >> FILENAME
	printf("    }\n}\n\n") >> FILENAME
	close(FILENAME)
}
END {
	printf("Haa\n")
}

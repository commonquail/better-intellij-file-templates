#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public final class ${NAME} {
    private static final ${NAME} INSTANCE = new ${NAME}();

    public static ${NAME} getInstance() {
        return INSTANCE;
    }

    private ${NAME}() {
    }
}

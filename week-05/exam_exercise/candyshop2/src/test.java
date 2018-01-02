String fileUrl = "src.java";

        List<String> myList = putFileInList(fileUrl);
        System.out.println(myList);
        List<String> myListWithNoComments = deleteteCommentLines(myList);
        System.out.println(myListWithNoComments);
        deleteCommentsFromListAndRewrite(fileUrl);

public static void deleteCommentsFromListAndRewrite(String fileUrl) {
        List<String> listToOrganize = putFileInList(fileUrl);
        List<String> organizedList = deleteteCommentLines(listToOrganize);
        Path destPath = Paths.get(fileUrl);
        try {
        Files.write(destPath, organizedList);
        } catch (Exception E) {
        System.out.println("Cannot write file");
        }
        }
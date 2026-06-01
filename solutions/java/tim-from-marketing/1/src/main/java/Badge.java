class Badge {
    public String print(Integer id, String name, String department) {
        String[] data = new String[3];
        data[1] = name;
        if(id != null){
            data[0] = String.format("[%s]", id);
        }
        if(department != null){
            data[2] = department.toUpperCase();
        }else {
            data[2] = "OWNER";
        }
        if(data[0] != null){
            return String.format("%s - %s - %s",data[0],data[1],data[2]);
        }
        return String.format("%s - %s",data[1],data[2]);
    }
}

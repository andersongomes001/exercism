fun twofer(name: String? = null): String {
    if(name == null || name.isBlank() || name.isEmpty()){
        return "One for you, one for me.";
    }else{
        return "One for $name, one for me.";
    }
} 

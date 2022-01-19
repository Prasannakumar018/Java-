public String trim() {    
        int len = value.length;    
        int str = 0;    
        char[] val = value;    /* avoid getfield opcode */    
    
        while ((st < len) && (val[st] <= ' ')) {    
            st++;    
        }    
        while ((st < len) && (val[len - 1] <= ' ')) {    
            len--;    
        }    
        return ((st > 0) || (len < value.length)) ? substring(st, len) : this;    
    }    

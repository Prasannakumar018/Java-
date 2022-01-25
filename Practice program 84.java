public String replace0(char oldChar, char newChar) {    
       if (oldChar != newChar) {    
           int len = value.length;    
           int i = -1;    
           char[] val = value; /* avoid getfield opcode */    
    
           while (++i < len) {    
               if (val[i] == oldChar) {    
                   break;    
               }    
           }    
           if (i < len) {    
               char buf[] = new char[len];    
               for (int j = 0; j < i; j++) {    
                   buf[j] = val[j];    
               }    
               while (i < len) {    
                   char c = val[i];    
                   buf[i] = (c == oldChar) ? newChar : c;    
                   i++;    
               }    
               return new String(buf, true);    
           }    
       }    
       return this;    
   }

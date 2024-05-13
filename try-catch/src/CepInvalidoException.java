public class CepInvalidoException extends Exception{
    
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
            throw new CepInvalidoException();
        return cep; 
    }
       
}

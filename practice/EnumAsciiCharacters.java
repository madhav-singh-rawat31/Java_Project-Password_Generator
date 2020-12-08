package practice;

public enum EnumAsciiCharacters {

    UPPERCASE( "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ),
    LOWERCASE( "abcdefghijklmnopqrstuvwxyz" ),
    NUMERIC( "1234567890" ),
    SPECIAL( "~!@#$%^&*" );

    private String characters;

    
    public String toString() {
      return this.characters;
    }

    private EnumAsciiCharacters( String characters ) {
      this.characters = characters;
    }
} // EnumAsciiCharacters
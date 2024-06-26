package com.tietoevry.util

object SplashScreenUtil {
    fun get(version: String): String {
        return """
            
                __  ___           __        _____                                 ____  _____
               /  |/  /___  _____/ /__     / ___/___  ______   _____  _____      / __ \/ ___/
              / /|_/ / __ \/ ___/ //_/_____\__ \/ _ \/ ___/ | / / _ \/ ___/_____/ / / /\__ \ 
             / /  / / /_/ / /__/ ,< /_____/__/ /  __/ /   | |/ /  __/ /  /_____/ /_/ /___/ / 
            /_/  /_/\____/\___/_/|_|     /____/\___/_/    |___/\___/_/        /_____//____/  
                                                                                Version $version

        """
    }

    fun print(version: String) {
        println(get(version))
    }
}
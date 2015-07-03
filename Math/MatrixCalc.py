"""


Semester oppgave 2013 - FE-MAT1000
*-  Jacobi iterasjon algoritme  -*

@author: Jens Walter Nordahl, 3MNT, HIVE.

Inkluderer: oppgave 1, oppgave 2, oppgave 3.


"""

##*** OPPGAVE1 ***##

A=[[1,2],[3,4]]
                            ######################################
B=[[0],[0]]                 ##          1 x 2matrise            ##  
C=[[0],[0]]                 ##  Her legges mellomregningene     ##
D=[[0],[0]]                 ##  Her legges resultatet av C + X  ##
X=[[2],[4]]                 ##          1 x 2matrise            ##  
linje=0                     ##           Linjeteller            ## 
kolonne=0                   ##          Kolonneteller           ##
mres=0                      ## Mellomresultat (mellomregninger) ##
pos=0                       ##        Posisjonsteller           ##
teller=0                    ##            Teller                ##
                            ######################################

while teller<21:                    # sålenge teller er mindre enn 54
    teller=teller+1                 # Teller øker med 1
    while linje<2:                  # sålenge linje er mindre enn 1
        while kolonne<1:            # sålenge kolonne er mindre enn 1
            while pos<2:            # sålenge posisjon er mindre enn 4
                mres=mres+A[linje][pos]*B[pos][kolonne]
                pos=pos+1           # Posisjonsteller øker med 1
                
            C[linje][kolonne]=mres  # Her legges mellomresultatene
            mres=0                  # Mellomresultat nullstilles
            pos=0                   # Posisjonsteller nullstilles
            kolonne=kolonne+1       # Kolonneteller øker med 1
        
        linje=linje+1               # Linjeteller øker med 1
        kolonne=0                   # Kolonneteller nullstilles
        pos=0                       # Posisjonsteller nullstilles
        
    linje=0                         # Linjeteller nullstilles
    kolonne=0                       # Kolonneteller nullstilles     
                 
    while linje<2:                  # sålenge linje er mindre enn 4
        while kolonne<1:            # sålenge kolonne er mindre enn 1
            D[linje][kolonne]=C[linje][kolonne]+X[linje][kolonne]
            kolonne=kolonne+1       # Kolonneteller øker med 1
                                    
        linje=linje+1               # Linjeteller øker med 1
        kolonne=0                   # Kolonneteller nullstilles
                                    
    B=D                             # B settes lik D før teller øker med 1
    linje=0                         # Linjeteller nullstilles

print D                             # Når teller er ferdig skrives D


##############################################################################
##############################################################################


##***OPPGAVE 2***##


A=[
 #x1 #x2 #x3 #x4
 [0,0.25,0.25,0],                    ###################
 [0.25,0,0,0.25],                    ## 4 x 4 matrise ##
 [0.25,0,0,0.25],                    ###################
 [0,0.25,0.25,0]
 ]                          ######################################
B=[[0],[0],[0],[0]]         ##          1 x 4matrise            ##  
C=[[0],[0],[0],[0]]         ##  Her legges mellomregningene     ##
D=[[0],[0],[0],[0]]         ##  Her legges resultatet av C + X  ##
X=[[50],[50],[25],[25]]     ##          1 x 4matrise            ##  
linje=0                     ##           Linjeteller            ## 
kolonne=0                   ##          Kolonneteller           ##
mres=0                      ## Mellomresultat (mellomregninger) ##
pos=0                       ##        Posisjonsteller           ##
teller=0                    ##            Teller                ##
                            ######################################

while teller<54:                    # sålenge teller er mindre enn 54
    teller=teller+1                 # Teller øker med 1
    while linje<4:                  # sålenge linje er mindre enn 1
        while kolonne<1:            # sålenge kolonne er mindre enn 1
            while pos<4:            # sålenge posisjon er mindre enn 4
                mres=mres+A[linje][pos]*B[pos][kolonne]
                pos=pos+1           # Posisjonsteller øker med 1
                
            C[linje][kolonne]=mres  # Her legges mellomresultatene
            mres=0                  # Mellomresultat nullstilles
            pos=0                   # Posisjonsteller nullstilles
            kolonne=kolonne+1       # Kolonneteller øker med 1
        
        linje=linje+1               # Linjeteller øker med 1
        kolonne=0                   # Kolonneteller nullstilles
        pos=0                       # Posisjonsteller nullstilles
        
    linje=0                         # Linjeteller nullstilles
    kolonne=0                       # Kolonneteller nullstilles     
                 
    while linje<4:                  # sålenge linje er mindre enn 4
        while kolonne<1:            # sålenge kolonne er mindre enn 1
            D[linje][kolonne]=C[linje][kolonne]+X[linje][kolonne]
            kolonne=kolonne+1       # Kolonneteller øker med 1
                                    
        linje=linje+1               # Linjeteller øker med 1
        kolonne=0                   # Kolonneteller nullstilles
                                    
    B=D                             # B settes lik D før teller øker med 1
    linje=0                         # Linjeteller nullstilles

print D                             # Når teller er ferdig skrives D


##############################################################################
##############################################################################


##***OPPGAVE 3***##


A=[
[0,0.25,0,0.25,0,0,0,0,0],
[0.25,0,0.25,0,0.25,0,0,0,0],
[0,0.25,0,0,0,0.25,0,0,0],
[0.25,0,0,0,0.25,0,0.25,0,0],
[0,0.25,0,0.25,0,0.25,0,0.25,0],
[0,0,0.25,0,0.25,0,0,0,0.25],
[0,0,0,0.25,0,0,0,0.25,0],
[0,0,0,0,0.25,0,0.25,0,0.25],
[0,0,0,0,0,0.25,0,0.25,0]
] #4*4 matrise
B=[[0],[0],[0],[0],[0],[0],[0],[0],[0]]
C=[[0],[0],[0],[0],[0],[0],[0],[0],[0]]
D=[[0],[0],[0],[0],[0],[0],[0],[0],[0]]
X=[[25],[5],[5],[20],[0],[0],[65],[45],[45]]
linje=0 #linjeteller
kolonne=0 #kolonneteller
mres=0 #mellomregninger (mellomresultat)
pos=0 #posisjonsteller
teller=0 #teller

while teller<150:
    teller=teller+1
    while linje<9:
        while kolonne<1:
            while pos<9:
                mres=mres+A[linje][pos]*B[pos][kolonne]
                pos=pos+1
                
            C[linje][kolonne]=mres
            mres=0
            pos=0
            kolonne=kolonne+1
        
        linje=linje+1
        kolonne=0
        pos=0
        
    linje=0
    kolonne=0
   
    while linje<9:
        while kolonne<1:
            D[linje][kolonne]=C[linje][kolonne]+X[linje][kolonne]
            kolonne=kolonne+1
        
        linje=linje+1
        kolonne=0
        
    B=D
    linje=0

print D
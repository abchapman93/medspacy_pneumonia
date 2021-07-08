import gov.va.vinci.leo.regex.types.RegularExpressionType

/* An arbitrary name for this annotator. Used in the pipeline for the name of this annotation. */
name = "Stroke Terms"

configuration {
    /* All configuration for this annotator. */
    defaults {
        /* Global for all configrations below if a property specified here is not overridden in a section below. */

        outputType = RegularExpressionType.class.canonicalName
        case_sensitive = false
        matchedPatternFeatureName = "pattern"
        concept_feature_name = "concept"
        groupFeatureName = "group"
    }

  "pneumonia"  {
        expressions = [
                'PNA',
                'HCAP',
                'bronchopneumonia',
                'pleuropneumonia',
                'legionellosis',
                'legionnaire',
                'pneumonia',
                'pneumonias',
                'pneumoniae',
                'neumonia ',
                'peumonia',
                'pnumonia',
                'pnemonia',
                'pneuonia',
                'pneumnia',
                'pneumoia',
                'pneumona',
                'pneumoni ',
                'ppneumonia',
                'pnneumonia',
                'pneeumonia ',
                'pneuumonia',
                'pneummonia',
                'pneumoonia',
                'pneumonnia',
                'pneumoniia',
                'pneumoniaa',
                'npeumonia',
                'penumonia',
                'pnuemonia ',
                'pnemuonia',
                'pneuomnia',
                'pneumnoia',
                'pneumoina',
                'pneumonai',
                'oneumonia',
                '0neumonia',
                'lneumonia ',
                'pbeumonia',
                'pheumonia',
                'pjeumonia ',
                'pmeumonia',
                'pnwumonia',
                'pn3umonia',
                'pn4umonia',
                'pnrumonia',
                'pnfumonia',
                'pndumonia',
                'pnsumonia',
                'pneymonia ',
                'pne7monia',
                'pne8monia',
                'pneimonia',
                'pnekmonia',
                'pnejmonia',
                'pnehmonia',
                'pneunonia',
                'pneujonia ',
                'pneukonia',
                'pneuminia',
                'pneum9nia ',
                'pneum0nia',
                'pneumpnia',
                'pneumlnia',
                'pneumknia',
                'pneumobia',
                'pneumohia',
                'pneumojia',
                'pneumomia',
                'pneumonua ',
                'pneumon8a',
                'pneumon9a',
                'pneumonoa',
                'pneumonla',
                'pneumonka',
                'pneumonja',
                'pneumoniq',
                'pneumoniw ',
                'pneumonis',
                'pneumonix',
                'pneumoniz ',
                'opneumonia',
                'poneumonia',
                '0pneumonia',
                'p0neumonia',
                'lpneumonia',
                'plneumonia',
                'pbneumonia',
                'pnbeumonia',
                'phneumonia ',
                'pnheumonia',
                'pjneumonia',
                'pnjeumonia',
                'pmneumonia',
                'pnmeumonia',
                'pnweumonia',
                'pnewumonia',
                'pn3eumonia ',
                'pne3umonia',
                'pn4eumonia',
                'pne4umonia ',
                'pnreumonia',
                'pnerumonia',
                'pnfeumonia',
                'pnefumonia',
                'pndeumonia',
                'pnedumonia',
                'pnseumonia',
                'pnesumonia',
                'pneyumonia ',
                'pneuymonia',
                'pne7umonia',
                'pneu7monia',
                'pne8umonia',
                'pneu8monia',
                'pneiumonia',
                'pneuimonia',
                'pnekumonia ',
                'pneukmonia',
                'pnejumonia',
                'pneujmonia ',
                'pnehumonia',
                'pneuhmonia',
                'pneunmonia',
                'pneumnonia',
                'pneujmonia',
                'pneumjonia',
                'pneukmonia',
                'pneumkonia',
                'pneumionia ',
                'pneumoinia',
                'pneum9onia',
                'pneumo9nia',
                'pneum0onia',
                'pneumo0nia',
                'pneumponia',
                'pneumopnia',
                'pneumlonia ',
                'pneumolnia',
                'pneumkonia',
                'pneumoknia ',
                'pneumobnia',
                'pneumonbia',
                'pneumohnia',
                'pneumonhia',
                'pneumojnia',
                'pneumonjia',
                'pneumomnia',
                'pneumonmia',
                'pneumonuia ',
                'pneumoniua',
                'pneumon8ia',
                'pneumoni8a',
                'pneumon9ia',
                'pneumoni9a',
                'pneumonoia',
                'pneumonioa',
                'pneumonlia ',
                'pneumonila',
                'pneumonkia',
                'pneumonika ',
                'pneumonjia',
                'pneumonija',
                'pneumoniqa',
                'pneumoniaq',
                'pneumoniwa',
                'pneumoniaw',
                'pneumonisa',
                'pneumonias',
                'pneumonixa ',
                'pneumoniax',
                'pneumoniza',
                'pneumoniaz ',
                //New Terms Per 1000 Doc Review
                'valley\\s*fever',
                'pneumonia',
                'pneum\\(cap\\)',
                'cap-RML',
                'legioner\'?s\\s*disease',
                'broncho-?pneumonia',
                '\bCAP\b', //(community-acquired pneumonia)
                '\bbkp\b'



        ]
        concept_feature_value = "Stroke"
        outputType = "gov.va.vinci.types.Concept"
    }

}








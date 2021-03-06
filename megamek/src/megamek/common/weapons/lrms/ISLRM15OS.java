/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons.lrms;

/**
 * @author Sebastian Brocks
 */
public class ISLRM15OS extends LRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 1089075678687256997L;

    /**
     *
     */
    public ISLRM15OS() {
        super();
        name = "LRM 15 (OS)";
        setInternalName(name);
        addLookupName("IS OS LRM-15");
        addLookupName("ISLRM15 (OS)");
        addLookupName("IS LRM 15 (OS)");
        heat = 5;
        rackSize = 15;
        minimumRange = 6;
        tonnage = 7.5f;
        criticals = 3;
        bv = 27;
        flags = flags.or(F_ONESHOT);
        cost = 87500;
        shortAV = 9;
        medAV = 9;
        longAV = 9;
        maxRange = RANGE_LONG;
        rulesRefs = "230,TM";
        techAdvancement.setTechBase(TECH_BASE_ALL)
        	.setIntroLevel(false)
        	.setUnofficial(false)
            .setTechRating(RATING_C)
            .setAvailability(RATING_C, RATING_C, RATING_C, RATING_C)
            .setISAdvancement(2665, 2676, 3045, 2800, 3030)
            .setISApproximate(true, false, false,false, false)
            .setClanAdvancement(2665, 2676, 3045, DATE_NONE, DATE_NONE)
            .setClanApproximate(true, false, false,false, false)
            .setPrototypeFactions(F_TH)
            .setProductionFactions(F_TH)
            .setReintroductionFactions(F_FW);
    }
}

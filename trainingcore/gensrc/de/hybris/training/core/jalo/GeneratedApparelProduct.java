/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 10, 2017 7:48:48 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.Utilities;
import de.hybris.platform.variants.jalo.VariantProduct;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.ApparelMixedPack;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.ApparelProduct ApparelProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedApparelProduct extends VariantProduct
{
	/** Qualifier of the <code>ApparelProduct.genders</code> attribute **/
	public static final String GENDERS = "genders";
	/** Qualifier of the <code>ApparelProduct.associatedMixedPacks</code> attribute **/
	public static final String ASSOCIATEDMIXEDPACKS = "associatedMixedPacks";
	/** Relation ordering override parameter constants for Product2MixedPackRel from ((trainingcore))*/
	protected static String PRODUCT2MIXEDPACKREL_SRC_ORDERED = "relation.Product2MixedPackRel.source.ordered";
	protected static String PRODUCT2MIXEDPACKREL_TGT_ORDERED = "relation.Product2MixedPackRel.target.ordered";
	/** Relation disable markmodifed parameter constants for Product2MixedPackRel from ((trainingcore))*/
	protected static String PRODUCT2MIXEDPACKREL_MARKMODIFIED = "relation.Product2MixedPackRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GENDERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.associatedMixedPacks</code> attribute.
	 * @return the associatedMixedPacks
	 */
	public Collection<ApparelMixedPack> getAssociatedMixedPacks(final SessionContext ctx)
	{
		final List<ApparelMixedPack> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			"ApparelMixedPack",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.associatedMixedPacks</code> attribute.
	 * @return the associatedMixedPacks
	 */
	public Collection<ApparelMixedPack> getAssociatedMixedPacks()
	{
		return getAssociatedMixedPacks( getSession().getSessionContext() );
	}
	
	public long getAssociatedMixedPacksCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			"ApparelMixedPack",
			null
		);
	}
	
	public long getAssociatedMixedPacksCount()
	{
		return getAssociatedMixedPacksCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.associatedMixedPacks</code> attribute. 
	 * @param value the associatedMixedPacks
	 */
	public void setAssociatedMixedPacks(final SessionContext ctx, final Collection<ApparelMixedPack> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2MIXEDPACKREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.associatedMixedPacks</code> attribute. 
	 * @param value the associatedMixedPacks
	 */
	public void setAssociatedMixedPacks(final Collection<ApparelMixedPack> value)
	{
		setAssociatedMixedPacks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to associatedMixedPacks. 
	 * @param value the item to add to associatedMixedPacks
	 */
	public void addToAssociatedMixedPacks(final SessionContext ctx, final ApparelMixedPack value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2MIXEDPACKREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to associatedMixedPacks. 
	 * @param value the item to add to associatedMixedPacks
	 */
	public void addToAssociatedMixedPacks(final ApparelMixedPack value)
	{
		addToAssociatedMixedPacks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from associatedMixedPacks. 
	 * @param value the item to remove from associatedMixedPacks
	 */
	public void removeFromAssociatedMixedPacks(final SessionContext ctx, final ApparelMixedPack value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2MIXEDPACKREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from associatedMixedPacks. 
	 * @param value the item to remove from associatedMixedPacks
	 */
	public void removeFromAssociatedMixedPacks(final ApparelMixedPack value)
	{
		removeFromAssociatedMixedPacks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, GENDERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders()
	{
		return getGenders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, GENDERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final List<EnumerationValue> value)
	{
		setGenders( getSession().getSessionContext(), value );
	}
	
}

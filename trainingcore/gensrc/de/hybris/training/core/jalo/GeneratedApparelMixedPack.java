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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.Utilities;
import de.hybris.platform.variants.jalo.VariantProduct;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.ApparelProduct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.ApparelMixedPack ApparelMixedPack}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedApparelMixedPack extends VariantProduct
{
	/** Qualifier of the <code>ApparelMixedPack.style</code> attribute **/
	public static final String STYLE = "style";
	/** Qualifier of the <code>ApparelMixedPack.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>ApparelMixedPack.packSize</code> attribute **/
	public static final String PACKSIZE = "packSize";
	/** Qualifier of the <code>ApparelMixedPack.swatchColors</code> attribute **/
	public static final String SWATCHCOLORS = "swatchColors";
	/** Qualifier of the <code>ApparelMixedPack.associatedProducts</code> attribute **/
	public static final String ASSOCIATEDPRODUCTS = "associatedProducts";
	/** Relation ordering override parameter constants for Product2MixedPackRel from ((trainingcore))*/
	protected static String PRODUCT2MIXEDPACKREL_SRC_ORDERED = "relation.Product2MixedPackRel.source.ordered";
	protected static String PRODUCT2MIXEDPACKREL_TGT_ORDERED = "relation.Product2MixedPackRel.target.ordered";
	/** Relation disable markmodifed parameter constants for Product2MixedPackRel from ((trainingcore))*/
	protected static String PRODUCT2MIXEDPACKREL_MARKMODIFIED = "relation.Product2MixedPackRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STYLE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(PACKSIZE, AttributeMode.INITIAL);
		tmp.put(SWATCHCOLORS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.associatedProducts</code> attribute.
	 * @return the associatedProducts
	 */
	public Collection<ApparelProduct> getAssociatedProducts(final SessionContext ctx)
	{
		final List<ApparelProduct> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			"ApparelProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.associatedProducts</code> attribute.
	 * @return the associatedProducts
	 */
	public Collection<ApparelProduct> getAssociatedProducts()
	{
		return getAssociatedProducts( getSession().getSessionContext() );
	}
	
	public long getAssociatedProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			"ApparelProduct",
			null
		);
	}
	
	public long getAssociatedProductsCount()
	{
		return getAssociatedProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.associatedProducts</code> attribute. 
	 * @param value the associatedProducts
	 */
	public void setAssociatedProducts(final SessionContext ctx, final Collection<ApparelProduct> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2MIXEDPACKREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.associatedProducts</code> attribute. 
	 * @param value the associatedProducts
	 */
	public void setAssociatedProducts(final Collection<ApparelProduct> value)
	{
		setAssociatedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to associatedProducts. 
	 * @param value the item to add to associatedProducts
	 */
	public void addToAssociatedProducts(final SessionContext ctx, final ApparelProduct value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2MIXEDPACKREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to associatedProducts. 
	 * @param value the item to add to associatedProducts
	 */
	public void addToAssociatedProducts(final ApparelProduct value)
	{
		addToAssociatedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from associatedProducts. 
	 * @param value the item to remove from associatedProducts
	 */
	public void removeFromAssociatedProducts(final SessionContext ctx, final ApparelProduct value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.PRODUCT2MIXEDPACKREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PRODUCT2MIXEDPACKREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from associatedProducts. 
	 * @param value the item to remove from associatedProducts
	 */
	public void removeFromAssociatedProducts(final ApparelProduct value)
	{
		removeFromAssociatedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.packSize</code> attribute.
	 * @return the packSize - A normalized color mapping to a standardized front-end navigable name.
	 */
	public Integer getPackSize(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PACKSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.packSize</code> attribute.
	 * @return the packSize - A normalized color mapping to a standardized front-end navigable name.
	 */
	public Integer getPackSize()
	{
		return getPackSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.packSize</code> attribute. 
	 * @return the packSize - A normalized color mapping to a standardized front-end navigable name.
	 */
	public int getPackSizeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPackSize( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.packSize</code> attribute. 
	 * @return the packSize - A normalized color mapping to a standardized front-end navigable name.
	 */
	public int getPackSizeAsPrimitive()
	{
		return getPackSizeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.packSize</code> attribute. 
	 * @param value the packSize - A normalized color mapping to a standardized front-end navigable name.
	 */
	public void setPackSize(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PACKSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.packSize</code> attribute. 
	 * @param value the packSize - A normalized color mapping to a standardized front-end navigable name.
	 */
	public void setPackSize(final Integer value)
	{
		setPackSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.packSize</code> attribute. 
	 * @param value the packSize - A normalized color mapping to a standardized front-end navigable name.
	 */
	public void setPackSize(final SessionContext ctx, final int value)
	{
		setPackSize( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.packSize</code> attribute. 
	 * @param value the packSize - A normalized color mapping to a standardized front-end navigable name.
	 */
	public void setPackSize(final int value)
	{
		setPackSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.product</code> attribute.
	 * @return the product
	 */
	public ApparelProduct getProduct(final SessionContext ctx)
	{
		return (ApparelProduct)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.product</code> attribute.
	 * @return the product
	 */
	public ApparelProduct getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final ApparelProduct value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final ApparelProduct value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.style</code> attribute.
	 * @return the style - Color/Pattern of the product.
	 */
	public String getStyle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedApparelMixedPack.getStyle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, STYLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.style</code> attribute.
	 * @return the style - Color/Pattern of the product.
	 */
	public String getStyle()
	{
		return getStyle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.style</code> attribute. 
	 * @return the localized style - Color/Pattern of the product.
	 */
	public Map<Language,String> getAllStyle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,STYLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.style</code> attribute. 
	 * @return the localized style - Color/Pattern of the product.
	 */
	public Map<Language,String> getAllStyle()
	{
		return getAllStyle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.style</code> attribute. 
	 * @param value the style - Color/Pattern of the product.
	 */
	public void setStyle(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedApparelMixedPack.setStyle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, STYLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.style</code> attribute. 
	 * @param value the style - Color/Pattern of the product.
	 */
	public void setStyle(final String value)
	{
		setStyle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.style</code> attribute. 
	 * @param value the style - Color/Pattern of the product.
	 */
	public void setAllStyle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,STYLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.style</code> attribute. 
	 * @param value the style - Color/Pattern of the product.
	 */
	public void setAllStyle(final Map<Language,String> value)
	{
		setAllStyle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.swatchColors</code> attribute.
	 * @return the swatchColors - A normalized color mapping to a standardized front-end navigable name.
	 */
	public Set<EnumerationValue> getSwatchColors(final SessionContext ctx)
	{
		Set<EnumerationValue> coll = (Set<EnumerationValue>)getProperty( ctx, SWATCHCOLORS);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelMixedPack.swatchColors</code> attribute.
	 * @return the swatchColors - A normalized color mapping to a standardized front-end navigable name.
	 */
	public Set<EnumerationValue> getSwatchColors()
	{
		return getSwatchColors( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.swatchColors</code> attribute. 
	 * @param value the swatchColors - A normalized color mapping to a standardized front-end navigable name.
	 */
	public void setSwatchColors(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setProperty(ctx, SWATCHCOLORS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelMixedPack.swatchColors</code> attribute. 
	 * @param value the swatchColors - A normalized color mapping to a standardized front-end navigable name.
	 */
	public void setSwatchColors(final Set<EnumerationValue> value)
	{
		setSwatchColors( getSession().getSessionContext(), value );
	}
	
}

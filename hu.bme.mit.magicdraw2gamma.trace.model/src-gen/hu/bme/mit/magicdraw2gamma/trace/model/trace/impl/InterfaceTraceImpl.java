/**
 */
package hu.bme.mit.magicdraw2gamma.trace.model.trace.impl;

import hu.bme.mit.magicdraw2gamma.trace.model.trace.InterfaceTrace;
import hu.bme.mit.magicdraw2gamma.trace.model.trace.TracePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.magicdraw2gamma.trace.model.trace.impl.InterfaceTraceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mit.magicdraw2gamma.trace.model.trace.impl.InterfaceTraceImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceTraceImpl extends AbstractTraceImpl implements InterfaceTrace {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.INTERFACE_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<EObject>(EObject.class, this, TracePackage.INTERFACE_TRACE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<EObject>(EObject.class, this, TracePackage.INTERFACE_TRACE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TracePackage.INTERFACE_TRACE__TARGET:
			return getTarget();
		case TracePackage.INTERFACE_TRACE__SOURCE:
			return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TracePackage.INTERFACE_TRACE__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends EObject>) newValue);
			return;
		case TracePackage.INTERFACE_TRACE__SOURCE:
			getSource().clear();
			getSource().addAll((Collection<? extends EObject>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TracePackage.INTERFACE_TRACE__TARGET:
			getTarget().clear();
			return;
		case TracePackage.INTERFACE_TRACE__SOURCE:
			getSource().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TracePackage.INTERFACE_TRACE__TARGET:
			return target != null && !target.isEmpty();
		case TracePackage.INTERFACE_TRACE__SOURCE:
			return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceTraceImpl

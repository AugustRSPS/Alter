package org.alter.game.message.impl

import org.alter.game.message.Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
data class UpdateRebootTimerMessage(val cycles: Int) : Message